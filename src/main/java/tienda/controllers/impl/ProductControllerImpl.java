package tienda.controllers.impl;

import tienda.config.Paths;
import tienda.controllers.ProductController;
import tienda.models.Producto;
import tienda.models.impl.CategoriaTrabajo;
import tienda.models.impl.FamiliaCelulares;
import tienda.models.impl.GamaAltaFactory;
import tienda.models.impl.GamaBajaFactory;
import tienda.models.interfaces.IProductoFactory;
import tienda.repositories.ProductoRepositorio;
import io.javalin.http.Context;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.NotFoundResponse;

import com.google.common.base.StandardSystemProperty;

//import org.bson.types.ObjectId;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;
import tienda.models.impl.GamaMediaFactory;
import tienda.models.interfaces.IBateria;
import tienda.models.interfaces.ICamara;


public class ProductControllerImpl implements ProductController {
    private static final String ID = "id";

    private ProductoRepositorio productRepository;

    public ProductControllerImpl(ProductoRepositorio postRepository) {
        this.productRepository = postRepository;
    }

    @Override
    public void create(Context context) {

        Producto Product = context.bodyAsClass(Producto.class);
        System.out.println("Producto: " + Product);

        //if (Product.getId() != null) {
        //    throw new BadRequestResponse(String.format("Unable to create a new post with existing id: %s", Product));
        //}

        productRepository.create(Product);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(Product.getId().toString()));

    }

    @Override
    public void delete(Context context) {
        productRepository.delete(context.pathParam(ID));

    }

    @Override
    public void find(Context context) {
        String id = context.pathParam(ID);
        Producto Product = productRepository.find(id);

        if (Product == null) {
            throw new NotFoundResponse(String.format("A Product with id '%s' is not found", id));
        }

        context.json(Product);

    }

    @Override
    public void findAll(Context context) {
        context.json(productRepository.findAll());
    }

    @Override
    public void update(Context context) {
        Producto product = context.bodyAsClass(Producto.class);
        String id = context.pathParam(ID);

        if (product.getId() != null && !product.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }

        productRepository.update(product, id);

    }

    @Override
    public void loadProducts(Context context) {
        
        //GAMA BAJA
        IProductoFactory abstractFactory = new GamaBajaFactory();
        String lineaGB = abstractFactory.getLineaProducto().getLinea();
        String mantenimientoGB = abstractFactory.getMantenimiento().getPeriodo();
        
        ICamara camaraGB = abstractFactory.getCamara();
        camaraGB.setPrincipal("8MP");
        camaraGB.setPosterior("16MP");
        camaraGB.setProfundidad("2MP");
        
        IBateria bateriaGB = abstractFactory.getBateria();
        bateriaGB.setCapacidad("2.000 maH");
        bateriaGB.setTipoCarga("Carga rapida");
        bateriaGB.setPotencia("33 W");

        Producto pr1 = new Producto( "P200201", "Nokia", 1400.00, lineaGB, mantenimientoGB );
        pr1.setFamilia( new FamiliaCelulares() );
        pr1.setCamara(camaraGB);
        pr1.setBateria(bateriaGB);
        productRepository.create(pr1);
        
        //GAMA MEDIA
        abstractFactory = new GamaMediaFactory();
        String lineaGM = abstractFactory.getLineaProducto().getLinea();
        String mantenimientoGM = abstractFactory.getMantenimiento().getPeriodo();
        
        ICamara camaraGM = abstractFactory.getCamara();
        camaraGM.setPrincipal("64MP");
        camaraGM.setPosterior("16MP");
        camaraGM.setProfundidad("2MP");
        
        IBateria bateriaGM = abstractFactory.getBateria();
        bateriaGM.setCapacidad("3.500 maH");
        bateriaGM.setTipoCarga("Carga rapida");
        bateriaGM.setPotencia("45 W");

        Producto pr2 = new Producto( "P200202", "Samsung", 2200.00, lineaGM, mantenimientoGM );
        pr2.setFamilia( new FamiliaCelulares( new CategoriaTrabajo() ) );
        pr2.setCamara(camaraGM);
        pr2.setBateria(bateriaGM);
        productRepository.create(pr2);
        
        //GAMA ALTA
        abstractFactory = new GamaAltaFactory();
        String lineaGA = abstractFactory.getLineaProducto().getLinea();
        String mantenimientoGA = abstractFactory.getMantenimiento().getPeriodo();
        
        ICamara camaraGA = abstractFactory.getCamara();
        camaraGA.setPrincipal("108MP");
        camaraGA.setPosterior("16MP");
        camaraGA.setProfundidad("2MP");
        
        IBateria bateriaGA = abstractFactory.getBateria();
        bateriaGA.setCapacidad("4.000 maH");
        bateriaGA.setTipoCarga("Carga rapida");
        bateriaGA.setPotencia("55 W");

        Producto pr3 = new Producto( "P200203", "Iphone", 3400.00, lineaGA, mantenimientoGA );
        pr3.setFamilia( new FamiliaCelulares( new CategoriaTrabajo() ) );
        pr3.setCamara(camaraGB);
        pr3.setBateria(bateriaGB);
        productRepository.create(pr3);

    }
    
}