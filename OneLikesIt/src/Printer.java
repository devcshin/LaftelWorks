
public class Printer {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserNames user = new UserNames();
		
		//0���϶�
		
		if(user.name.length==0){
			System.out.print("No one likes this");
		}
		
		//1���϶�
		
		if(user.name.length==1){
			System.out.print(user.name[0]+" likes this");
		}
		
		//2���϶�
		
		if(user.name.length==2){
			System.out.print(user.name[0]+", "+user.name[1]+" like this");
		}
		
		//3���϶�
		if(user.name.length==3){
			System.out.print(user.name[0]+", "+user.name[1]+" and " +user.name[2]+" like this");
		}
		
		//4�� �̻�
		if(user.name.length>3){
			for(int i=0; i<2; i++){
				System.out.print(user.name[i]+", ");
				
			}
			System.out.print("and "+(user.name.length-2)+" others like this");
		}
		
				
	}

}
