
public class main {

	public static void main(String[] args) {
		empleados emp=new empleados("123456789k", "Paco", "Leon Gonzalez", "C/Maestro Pedro, 23", 123456789);
		empleados emp2=new empleados("123456789p", "Juan", "Gonzalez Gil", "C/Maestro Pedro, 24", 234567891);
		empleados emp3=new empleados("123456789j", "Antonio", "Leon Gonzalez", "C/Maestro Pedro, 23", 123213214);
		
		System.out.println("El nombre completo del empleado es: "+emp.getNombre()+" "+emp.getApellidos());
		System.out.println("Vive en: "+emp.getDireccion());
		System.out.println("Su DNI es: "+emp.getId());
		System.out.println("Telefono: "+emp.getTlfno());
		
		System.out.println("");
		
		System.out.println("El nombre completo del empleado es: "+emp2.getNombre()+" "+emp2.getApellidos());
		System.out.println("Vive en: "+emp2.getDireccion());
		System.out.println("Su DNI es: "+emp2.getId());
		System.out.println("Telefono: "+emp2.getTlfno());
		
		System.out.println("");
		
		System.out.println("El nombre completo del empleado es: "+emp3.getNombre()+" "+emp3.getApellidos());
		System.out.println("Vive en: "+emp3.getDireccion());
		System.out.println("Su DNI es: "+emp3.getId());
		System.out.println("Telefono: "+emp3.getTlfno());
	}

}
