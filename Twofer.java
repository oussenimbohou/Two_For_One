public class Twofer {
    public String twofer(String name) {
        String msg = ", one for me.";
        if(name != null && !name.equals("")){
            return "One for "+name+msg;
        }else if(name == null || name.isEmpty()){
            return "One for you"+msg;
    }
        return null;
    }
}
