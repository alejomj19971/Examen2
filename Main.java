import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner inputData = new Scanner(System.in);
    ArrayList<Watchman> watchmen = new ArrayList<>();
    ArrayList<CleaningStaff> cleaningStaffs = new ArrayList<>();
    ArrayList<Accountant> accountants = new ArrayList<>();
    ArrayList<Admin> admins = new ArrayList<>();

    int opcionCaso;
    String condicionSalida = "SI";


    while (condicionSalida.equalsIgnoreCase("SI")) {


        System.out.println("Base de datos Xempresa");
        System.out.println("Oprima 1 para agregar informacion de Watchman");
        System.out.println("Oprima 2 para agregar informacion de CleanningStaff");
        System.out.println("Oprima 3 para agregar informacion de Accountant");
        System.out.println("Oprima4 para agregar informacion de Admin");
        System.out.println("Las siguientes opciones son para mostrar los registros,si no se ha almacenado ningun registro aparecera un vacio");
        System.out.println("Oprima 5 para mostrar registros almacenados de Watchman");
        System.out.println("Oprima 6 para mostrar registros almacenados de CleanningStaff");
        System.out.println("Oprima 7 para mostrar registros almacenados  de Accountant");
        System.out.println("Oprima 8 para mostrar registros almacenados de Admin");
        System.out.println();
        opcionCaso =Integer.parseInt(inputData.nextLine());

        if (opcionCaso<1 && opcionCaso>8) {
            System.out.println("Por favor reinicie el programa y agregue una opcion valida 1 - 8");
        } else {

            switch (opcionCaso) {

                // ingreso datos
                case 1:
                    Watchman watchman = new Watchman();
                    System.out.println("Ingrese el nombre :");
                    watchman.setName(inputData.nextLine());
                    System.out.println("Ingrese Identificación :");
                    watchman.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese Edad :");
                    watchman.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Ingrese codigo y nombre del arma con la que traba :");
                    watchman.setWeapon(inputData.nextLine());
                    System.out.println("Ingrese dias en los que trabaja :");
                    watchman.setWorkday(inputData.nextLine());
                    watchmen.add(watchman);
                    break;


                case 2:
                    CleaningStaff cleaningStaff = new CleaningStaff();
                    System.out.println("Ingrese el nombre :");
                    cleaningStaff.setName(inputData.nextLine());
                    System.out.println("Ingrese Identificación :");
                    cleaningStaff.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese Edad :");
                    cleaningStaff.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Ingrese dias libres:");
                    cleaningStaff.setDayOff(inputData.nextLine());
                    cleaningStaffs.add(cleaningStaff);
                    break;


                case 3:
                    Accountant accountant = new Accountant();
                    System.out.println("Ingrese el nombre :");
                    accountant.setName(inputData.nextLine());
                    System.out.println("Ingrese Identificación :");
                    accountant.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese Edad :");
                    accountant.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Lidera algun proceso en la empresa -Si -No ");
                    accountant.setLeader(inputData.nextLine());
                    System.out.println("Ingrese el codigo de su estacionamiento ");
                    accountant.setParking(inputData.nextLine());
                    accountants.add(accountant);
                    break;


                case 4:
                    Admin admin = new Admin();
                    System.out.println("Ingrese el nombre :");
                    admin.setName(inputData.nextLine());
                    System.out.println("Ingrese Identificación :");
                    admin.setIdentification(inputData.nextLine());
                    System.out.println("Ingrese Edad :");
                    admin.setAge(Integer.parseInt(inputData.nextLine()));
                    System.out.println("Lidera un proceso en la empresa -Si -No ");
                    admin.setLeader(inputData.nextLine());
                    System.out.println("Ingrese el codigo de su estacionamiento ");
                    admin.setParking(inputData.nextLine());
                    admins.add(admin);
                    break;
                // muestro datos

                case 5:
                    for(int i=0;i<watchmen.size();i++){

                        System.out.println(" Nombre : "+watchmen.get(i).getName());
                        System.out.println(" Id : "+watchmen.get(i).getIdentification());
                        System.out.println(" Edad : "+watchmen.get(i).getAge());
                        System.out.println(" Arma asignada : "+watchmen.get(i).getWeapon());
                        System.out.println(" Dias de trabajo : "+watchmen.get(i).getWorkday());
                    }
                  break;



                case 6:
                    for(int i=0;i<cleaningStaffs.size();i++){

                        System.out.println(" Nombre : "+cleaningStaffs.get(i).getName());
                        System.out.println(" Id : "+cleaningStaffs.get(i).getIdentification());
                        System.out.println(" Edad : "+cleaningStaffs.get(i).getAge());
                        System.out.println(" Dias libres : "+cleaningStaffs.get(i).getDayOff());

                    }
                    break;


                case 7:
                    for(int i=0;i<accountants.size();i++){

                        System.out.println(" Nombre : "+accountants.get(i).getName());
                        System.out.println(" Id : "+accountants.get(i).getIdentification());
                        System.out.println(" Edad : "+accountants.get(i).getAge());
                        System.out.println(" Lidera algún proceso : "+accountants.get(i).getLeader());
                        System.out.println(" Codigo Estacionamiento : "+accountants.get(i).getParking());

                    }
                    break;

                case 8:
                    for(int i=0;i<admins.size();i++){

                        System.out.println(" Nombre : "+admins.get(i).getName());
                        System.out.println(" Id : "+admins.get(i).getIdentification());
                        System.out.println(" Edad : "+admins.get(i).getAge());
                        System.out.println(" Lidera algún proceso : "+admins.get(i).getLeader());
                        System.out.println(" Codigo Estacionamiento : "+admins.get(i).getParking());

                    }
                    break;










            }

        }

        System.out.println(" Desea agregar más datos o mostrar los registros -SI -NO");
        condicionSalida= inputData.nextLine();
    }



















}




































}
