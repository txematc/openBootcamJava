package ejercicioInterface;

public class CocheCDRUImpl implements CocheCRUD {
	  @Override
      public void save() {
     }

     @Override
    public void findAll() {
     }

     @Override
      public void delete(){
     }

     String  save = "Save" ;
     String  findAll = "findAll" ;
     String  delete = "Delete" ;

     @Override
      public String toString () {
         return  "CocheCRUDImpl" +
                 " guardar=" + save +
                 ", buscarTodo=" + findAll +
                 ", eliminar=" + delete ;
     }
 
}
