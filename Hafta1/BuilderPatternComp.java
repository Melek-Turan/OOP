package builder;


class Computer{
	  private String marka;
	  private String ekrankarti;
	  private int ekranboyutu;
	  private int ram;
	  private boolean hdmi;
	public String getMarka() {
		return marka;
	}
	public String getEkrankarti() {
		return ekrankarti;
	}
	public int getEkranboyutu() {
		return ekranboyutu;
	}
	public int getRam() {
		return ram;
	}
	public boolean isHdmi() {
		return hdmi;
	}
	  private Computer(ComputerBuilder builder) {
		    this.marka = builder.marka;
		    this.ekrankarti = builder.ekrankarti;
		    this.ekranboyutu = builder.ekranboyutu;
		    this.ram = builder.ram;
		    this.hdmi = builder.hdmi;
		  }
  public static class ComputerBuilder {
	  private String marka;
	  private String ekrankarti;
	  private int ekranboyutu;
	  private int ram;
	  private boolean hdmi;
	    public ComputerBuilder(String marka,String ekrankarti, int ekranboyutu,int ram) {
	      this.marka = marka;
	      this.ekrankarti = ekrankarti;
	      this.ekranboyutu = ekranboyutu;
	      this.ram = ram;
	    }
	    
	    public ComputerBuilder setHdmi(boolean hdmi) {
	    	this.hdmi = hdmi;
	      return this;
	    }
	    
	    public Computer build() {
	      return new Computer(this);
	    }
	  }
	  
	  
	  
}


public class BuilderPatternComp {
	public static void main(String[] args) {

	    Computer comp1 = new Computer.ComputerBuilder("Monster","NVIDIA GTX",17,16).build();
	    Computer comp2 = new Computer.ComputerBuilder("Lenova","AMD",15,8).setHdmi(true).build();

	    
	    System.out.println("Computer 1\n"+"Marka : "+comp1.getMarka()+"\nEkran Kartý: "+comp1.getEkrankarti()+
	    		"\nEkran Boyutu : "+comp1.getEkranboyutu()+"\nRam : "+comp1.getRam()+"\n\n");
	    
	    System.out.println("Computer 2\n"+"Marka : "+comp2.getMarka()+"\nEkran Kartý: "+comp2.getEkrankarti()+
	    		"\nEkran Boyutu : "+comp2.getEkranboyutu()+"\nRam : "+comp2.getRam()+"\nHdmi : "+ (comp2.isHdmi() ? "Var" : "Yok"));

	  }

}
