package transport;

public class Car {

    private final String stamp; // Марка
    private final String model; // Модель
    private String color; // Цвет
    private final String country; // Строна сборки
    private double engineVolume; // Объем двигателя в литрах
    private final int year; // Год производства
    private String transmission; // Коробка передачь
    private final String bodyType; // Тип кузова
    private String registrationNumber; // Регистроционный номер
    private final int numberSeats; // Количество мест
    private String typeTires; // Летняя или Зимняя резин

    public Car(String stamp, String model, String color, String country, double engineVolume, int year, String transmission, String bodyType, String registrationNumber, int numberSeats, String typeTires) {
        this.stamp = (stamp == null || stamp.isBlank() || stamp.isEmpty()) ? " " : stamp;
        this.model = (model == null || model.isEmpty() || model.isBlank()) ? " " : model;
        this.color = (color == null || color.isEmpty() || color.isBlank()) ? "individual order!! " : color; // индивидуальный заказ
        this.country = (country == null || country.isEmpty() || country.isBlank()) ? "Сделанно в..." : country;
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.year = (year <= 0) ? 2005 : year;
        this.transmission = transmission == null || transmission.isEmpty() || transmission.isBlank() ? " " : transmission;
        this.bodyType = bodyType == null || bodyType.isEmpty() || bodyType.isBlank() ? "individual order!!! " : bodyType; // индивидуальный заказ
        this.registrationNumber = registrationNumber == null ? "d345j" : registrationNumber;
        this.numberSeats = (numberSeats <= 0) ? 6 : numberSeats;
        this.typeTires = typeTires;
    }

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getYear() {
        return year;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String isTypeTires() {
        return typeTires;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTypeTires(String typeTires) {
        this.typeTires = typeTires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "stamp='" + stamp + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", engineVolume=" + engineVolume +
                ", year=" + year +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberSeats=" + numberSeats +
                ", typeTires='" + typeTires + '\'' +
                '}';
    }


    public String typeTires(int month) { // Метод для определения летней или зимней резины
        if (month >= 4 && month <= 11) {
            return "на летней резине...";
        } else {
            if (month <= 0 || month > 12) {
                return " на зимней резине...";
            } else {
                return null;
            }
        }

    }


    public class Key {


        private final int remoteLaunch; // Удаленный запуск двигателя
        private final int keylessAccess; // Доступ без ключа

        public Key(int remoteLaunch, int keylessAccess) {
            this.remoteLaunch = (remoteLaunch != 1 && remoteLaunch != 0) ? 1 : remoteLaunch;
            this.keylessAccess = (remoteLaunch != 1 && remoteLaunch != 0) ? 1 : remoteLaunch;
            if (this.remoteLaunch == 0) System.out.println("\t Двери закрыты.");
            if (this.remoteLaunch == 1) System.out.println("\t Двери открыты.");
            if (this.keylessAccess == 0 ) System.out.println("\t Двигатель заглушен.");
            if (this.keylessAccess == 1) System.out.println("\t Двигатель заведён.");
        }


    }
}
























