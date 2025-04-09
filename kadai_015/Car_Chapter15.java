package kadai_015;

public class Car_Chapter15 {
    private int gear = 1; // ギア (初期値: 1)
    private int speed = 10; // 速度 (初期値: 10)

    // ギア変更メソッド
    public void gearChange(int afterGear) {
        switch (afterGear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10; // 上記以外は時速10km
                break;
        }
        System.out.println("ギア"+this.gear+"から"+afterGear+"に切り替えました");
        
    }

    // 走行メソッド（速度を表示）
    public void run() {
        System.out.println("速度は時速" +speed+ "kmです");
    }
}
