public class Customer extends User {

    // TODO: constructor

    public Customer(String name,int id){
        super(name,id);
    }
    @Override
    public void manageService(Service s) {
        System.out.println("Customer cannot manage services");
        // TODO:
        // print that customer cannot manage services

    }

    
        

        // TODO:
        // print customer using message
        // call performService()
    @Override
    public void useService(Service s) {
    System.out.println("Customer is using the service.");
    s.performService();
}


    }
