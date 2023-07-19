class Nested_Switch{

        public static void main(String[] args){

                System.out.println("OHH PUNE");
                String str = "veg";
                String str1 ="Starter";
                String str2 ="Main Course";
                switch(str){

                        case "veg":
                                

                                        switch(str1){
                                                case "Starter":
                                                        System.out.println("panner chilli");
                                                        break;
                                                case "MainCourse":
                                                        System.out.println("veg Kolhapuri");
                                                        break;
                                                default :
                                                        System.out.println("Masala papad");
                                                        break;
                                                };
                                break;
                        case "Non Veg":
                                

                                        switch(str2){
                                                case "Starter":
                                                        System.out.println("Chicken fry");
                                                        break;
                                                case "Main Course":
                                                        System.out.println("mutan handi");
                                                        break;
                                                }
                               
                                break;
	}

        }
}



