class account {
    int acc_id;
    string acc_name;
    account(int id, string name){
        this.acc_id=id;
        this.acc_name=name;
    }
    public static void main(String[] args) {
        account a1=new account(101, "rahul");
        account a2=new account(102,"sonia");
        System.out.println(a1.acc_id+":"+a1.acc_name);
        System.out.println(a2.acc_id+":"+a2.acc_name);
    }
}
