public class ConsultationService extends Service
        implements Billable {
    
    // TODO: constructor
    public ConsultationService(String ServiceName,int serviceId){
        super(ServiceName,serviceId);
      
    }


    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if(this.getIsActive()){
            System.out.println("Active");
        } else {
             System.out.println("not Active");
        }

    }

    @Override
    public void generateBill() {
        System.out.println("bill generated for consultation service");
        // TODO:
        // print billing message

    }
}