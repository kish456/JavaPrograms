class KshoreDemo {
	
		int id;
		String name;
		KshoreDemo (int id ,String name){
			this.id=id;
			this.name=name;
			
		}
		void display() {
			System.out.println(id+" "+name);
		}
		public static void main(String[] args) {
			
	KshoreDemo s1 = new KshoreDemo (461,"AI RITHEESH ");
	KshoreDemo  s2 = new KshoreDemo (437,"AI BHAI");
	s1.display();
	s2.display();
	}
	}


