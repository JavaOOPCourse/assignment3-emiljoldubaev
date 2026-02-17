public class StreamingService extends Service
        implements PremiumFeature {

    
    // TODO: declare premium field
     private boolean premium;
     


    // TODO: constructor
    public StreamingService(String serviceName,int serviceId){
        super(serviceName,serviceId);
        this.premium=false;
       

    }

    

    @Override
    public void performService() {
       if(!getIsActive()){
        System.out.println("Service is not active");
        return;

       }
       if (premium){
        System.out.println("Streaming in Premium quality");
       } else {
        System.out.println("Streaming in Standart quality.");
        
       }
        // TODO:
        // check if service is active
        // print different message for premium and normal

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        this.premium = true;
        System.out.println("Upgraded to Premium!");


    }
}