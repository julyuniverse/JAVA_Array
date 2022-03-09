public class MyArray {

    // 멤버 변수
    int[] intArr; // int array
    int count; // intArr 배열 내의 개수
    public int ARRAY_SIZE; // intArr 배열 최대 공간
    public static final int ERROR_NUM = -999999999;

    // 생성자
    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    // 생성자
    public MyArray(int size) { // intArr 배열 사이즈를 지정해서 인스턴스 생성
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    // 순차적인 요소 추가
    public void addElement(int num) {
        if (count >= ARRAY_SIZE) { // intArr 배열 내의 개수가 intArr 배열 최대 공간보다 같거나 크다면
            System.out.println("The array is full and I can't put more into it.");
            return;
        }

        // count 변수를 카운팅 해주고 해당 인덱스에 num 변숫값을 넣어 준다.
        intArr[count++] = num;
    }

    // 위치 지정 요소 추가
    public void addPositioningElement(int position, int num) {
        if (position < 0 || position > count) { // 인덱스의 위치가 존재하지 않는다면
            System.out.println("Check the position.");
            return;
        }

        if (count >= ARRAY_SIZE) { // intArr 배열이 가득 찼다면
            System.out.println("The array is full.");
            return;
        }

        for (int i = count - 1; i >= position; i--) { // position 위치에 닿을 때까지 배열의 가장 마지막 인덱스 위치부터 차례로 뒤로 옮겨 놓는다.
            intArr[i + 1] = intArr[i];
        }

        // 인덱스 위치를 다 옮겨 놓은 다음 해당 인덱스에 값을 넣어 주고 count 변수를 카운팅 해준다.
        intArr[position] = num;
        count++;
    }

    // 위치 지정 요소 삭제
    public int deletePositioningElement(int position) {
        int ret = ERROR_NUM;

        if (isEmpty()) { // 배열이 비어 있다면
            System.out.println("The array is empty.");
            return ret;
        }

        if (position < 0 || position > count - 1) { // 인덱스의 위치가 존재하지 않는다면
            System.out.println("Check the position.");
            return ret;
        }

        ret = intArr[position];

        for (int i = position; i < count - 1; i++) { // 배열의 가장 마지막 인덱스 위치에 닿을 때까지 position 위치부터 차례로 앞으로 옮겨 놓는다.
            intArr[i] = intArr[i + 1];
        }

        // 인덱스 위치를 다 옮겨 놓은 다음 마지막 인덱스의 값은 0 처리하고 count 변수를 카운팅 해준다.
        intArr[count - 1] = 0;
        count--;

        return ret;
    }

    // 배열이 비었는지 체크
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
