enum info{
    kanishka,joshi,IT,B,IETDAVV;
}

public class enumeration {
    public static void main(String[] args) {
        info name=info.kanishka;
        info surname=info.joshi;
        System.out.println("Name: "+ name +" "+ surname);

        info branch= info.IT;
        info section =info.B;
        System.out.println("Branch:" +branch +"'"+section);
        
        info college= info.IETDAVV;
        System.out.println("College:"+college);

    }
    
}
