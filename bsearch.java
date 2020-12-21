// =============== Program Description =============== 
// 程式名稱：bsearch.java  
// Binary search                             
// 程式目的：運用非遞迴方式設計二元搜尋法的程式               
// =================================================== 


public class bsearch
{
    public static int Max = 25;
    public static int[] Data =
            {  12,  16,  19,  22,  25,
               32,  39,  48,  55,  57,
               58,  63,  68,  69,  70,
               78,  84,  88,  90,  97,
               100, 101, 102, 103, 104};        // 資料陣列
    public static int Counter = 1;                // 計數器
    public static void main(String args[])
    {            
                            // 輸入欲搜尋值
        System.out.print("Please enter your key value : ");
                            // 讀入輸入數值
        ConsoleReader console = new ConsoleReader(System.in);
        int KeyValue = console.readInt();
                            // 呼叫二元搜尋
        if ( BinarySearch((int) KeyValue) )
        {
                            // 印出搜尋次數
            System.out.println("");
            System.out.println("Search Time = "+(int) Counter);
        }
        else
        {
                            // 印出沒有找到資料
            System.out.println("");
            System.out.println("No Found!!");
        }
    }

// ---------------------------------------------------
// 二分搜尋法 
// ---------------------------------------------------
    public static boolean BinarySearch(int KeyValue)
    {
        int    Left;                // 左邊界變數
        int    Right;                // 右邊界變數
        int    Middle;                // 中位數變數

        Left = 0;
        Right = Max - 1;

        while ( Left <= Right )
        {
            Middle = ( Left + Right ) / 2;
            if ( KeyValue < Data[Middle] )    // 欲搜尋值較小
                Right = Middle - 1;    // 搜尋前半段
                            // 欲搜尋值較大
            else if ( KeyValue > Data[Middle] )
                Left = Middle + 1;    // 搜尋後半段
                            // 搜尋到資料
            else if ( KeyValue == Data[Middle] )
            {
                System.out.println("Data["+Middle+"] = "+Data[Middle]);
                return true;
            }
            Counter++;
        }
        return false;
    }
}