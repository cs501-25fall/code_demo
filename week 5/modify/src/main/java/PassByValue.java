public class PassByValue {
    static void modifyElement(int[] arr) {
        arr[0] = 99;
        arr = new int[]{1, 2, 3};
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        modifyElement(nums);
        System.out.println(nums[0]);
        System.out.println(nums[0]);
    }
}


