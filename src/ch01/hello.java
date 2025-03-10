import java.util.*;

class hello{
    static void menuPrint() {
        System.out.println("================");
        System.out.println("1.이름 추가하기");
        System.out.println("2.리스트 보기");
        System.out.println("3.추첨하기");
        System.out.println("4.당첨자 보기");
        System.out.println("5.프로그램 종료");
        System.out.println("================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nameList = new ArrayList<>();
        Random rand = new Random();
        while(true){
            menuPrint();          
            int num = sc.nextInt();
            
            switch(num){
                case 1:
                    System.out.println("이름을 입력해주세요.");
                    String newName = sc.nextLine();
                    nameList.add(newName);
                    break;
                case 2:
                    System.out.println("입력된 이름 리스트 보기.");
                    System.out.println(nameList);
                    break;
                case 3:
                    System.out.println("추첨하기.");
                    int randIndex = rand.nextInt(nameList.size());
                    System.out.println(nameList[randIndex]);
                    break;
                case 4:
                    System.out.println("4번 경우입니다.");
                    break;
                case 5:
                    System.out.println("끝내기.");
                    break;
                default:
                    System.out.println("올바른 숫자를 입력해주세요.");
                }
        }
        
    }
}