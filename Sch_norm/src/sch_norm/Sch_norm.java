package sch_norm;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sch_norm {

    public static void main(String[] args) throws IOException {
        ArrayList<Data> Datas=new ArrayList();
        Path filePath = Paths.get("schumacher.csv");
        Charset charset = StandardCharsets.UTF_8;
        List<String> FileDataRead=Files.readAllLines(filePath,charset);
        for (int i = 1; i < FileDataRead.size(); i++) {
            var dataopr=FileDataRead.get(i).split(";");
            Data d=new Data();
            d.Date=dataopr[0];
            d.Grandprix=dataopr[1];
            d.Position=Integer.parseInt(dataopr[2]);
            d.Laps=Integer.parseInt(dataopr[3]);
            d.Points=Integer.parseInt(dataopr[4]);
            d.Team=dataopr[5];
            d.Status=dataopr[6];
            Datas.add(d);
        }
        Solutions s=new Solutions(Datas);
        s.NumbersOfDataLines();
        s.HungarianSucces();
        s.Defeat();
    }
    
}
