package uml_basico.EditorVideo_Proyecto_Render;

public class EditorVideo {

    Render render;

    public void exportar(String formato, Proyecto proyecto) {
        this.render = new Render(formato);
        System.out.println("Genero el render");
        System.out.println(render);
        System.out.println("Asocio el proyecto al render");
        render.setProyecto(proyecto);
        System.out.println(render);
    }

}
