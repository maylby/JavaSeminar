package JavaSeminar.TestWork;

import java.util.Objects;

public class Laptops {

    private String ram;
    private String hdd;
    private String cpu;
    private String screenSize;
    private int price;

    public String getCPU() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRAM() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHDD() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }


    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Laptops(String ram, String hdd, String cpu, String screenSize, int price ) {

        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.screenSize = screenSize;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "Процессор (CPU): '" + cpu + '\'' +
                ", Оперативная память (RAM): " + ram +
                ", Жесткий диск (HDD): " + hdd +
                ", Размер экрана: " + screenSize +
                ", Цена: " + price +
                '}';
    }

}
