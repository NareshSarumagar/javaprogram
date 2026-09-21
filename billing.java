class billing{
    String rastu;
    public void print_order(String order, int price,int qan){
        int total_price = price *qan;
        System.out.println("Order: "+order+"------>"+"price: "+price+"--->"+"qan---->"+qan+"\n"+"total_price----->"+total_price);
    }
    public static void main(String args[]){
        billing obj = new billing();
        obj.rastu = "food restrooo";
        System.out.println(obj.rastu);
        obj.print_order("cake", 350, 2);

    }
}