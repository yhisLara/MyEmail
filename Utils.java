public class Utils {

public static int getRandomColor(){
   Random rnd = new Random();
   return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
}

public List<Fruit> getDummyData(){
     List<Email> lista = new ArrayList<Email>(){{
         add(new Email("Presupuesto","Estimado,le enviamos nuestro presupuesto para el segundo semestre en el area de informática","ihn@bommi.cl",getRandomColor();));
         add(new Email("Nueva Hora","Le recordamos que usted tiene una nueva para la cita dental ","gustavo@cl.df.com",getRandomColor();));
         add(new Email("Citación","Le recordamos que se ha cambiado la hora de su cita dental por dia administrativo","gustavo@cl.df.com",getRandomColor();));
         add(new Email("Nuevo Mac","Te invitamos a conocer lo nuevo de mac, este sabado en nuestras tiendas del mall","maconline@mac.com",getRandomColor();));
         add(new Email("Problemas con app","Hola usuario,te informamos que nuestra appa esta presentando problemas","google@play.com",getRandomColor();));
         add(new Email("Boletas validas","Adjunto boletas validas para ser presentadas con el contador el dia vierna a las 09 am. cualquier duda llamar al siguiente numero","ricardo@genius.com",getRandomColor();));
         add(new Email("Tickets para validar","Estimado, adunto información de los ticket que necesitan ser regularizados antes del viernes, para ser ejecutados el dia lunes a mas tardar.","renefg@bancochile.cl",getRandomColor();));
         add(new Email("Resumen reunión","Señores, a traves del siguiente email,envio el resumen de lo se vio en la reunión del lunes, cualquier duda responder el email con copia a todos.","jgh@colegio.cl",getRandomColor();));
         add(new Email("Presupuesto 2017","Estimado,le enviamos nuestro presupuesto para el segundo semestre en el area de informática","tgj@dummi.cl",getRandomColor();));
         add(new Email("Archivos delicados","Señores de appcompac, comunico a ustedes que los siguientes archivos adjuntados son de uso confidencial","francog@imb.cl",getRandomColor();));
         add(new Email("Documentos para apertura de cuenta","Estimado, informamos a usted que nos encontramos realizando la apertura de la cuenta solicitada, pero necesitams que nos adjunte los siguientes archivos","renef@bancochile.cl",getRandomColor();));
         add(new Email("Bienvenido a nuestra pataforma","Hola @lara, te damos la bienvenida a nuestra plataforma de aprendizaje, donde encontraras miles de cursos para ti.","coursera@world.com",getRandomColor();));
         add(new Email("Prueba gratuita","Gracias por preferir spotify, desde ahora y hasta 3 meses disfruta de tu cuenta gratuita, sin limite y sin publicidad","spotify@funny.com",getRandomColor();));
         add(new Email("Centro de formación","Estimados, queremos informarle que hemos abierto nuevos cursos en crecic, para mayor información respondan este email","soporte@crecic.cl",getRandomColor();));
     }};
     return lista;
 }
}
