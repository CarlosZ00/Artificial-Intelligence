package ontologies;

import jade.content.*;


public class Information implements AgentAction {
// ----------------------------------------------

   private int type;
   private String accountId;

   public int getType() {
      return type;
   }

   public String getAccountId() {
      return accountId;
   }

   public void setType(int type) {
      this.type = type;
   }

   public void setAccountId(String accountId) {
      this.accountId = accountId;
   }
}