package sistemas.distribuidos.sd;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/sensores")
public class SensorController {

    @GetMapping("/{id}")
    public HttpStatus getTempetaturaBySensor(@PathVariable("id") int id, @RequestParam("valor") float valor) {
        for (int i = 0; i < Sensor.sensorList.size(); i++) {
            if(Sensor.sensorList.get(i).id == id) {
                Sensor.sensorList.get(i).temperatura = valor;
                return HttpStatus.OK;
            }
        }
        return HttpStatus.NOT_FOUND;
    }


    @GetMapping
    public List<Sensor> getLeituras() {
        return Sensor.sensorList;
    }
}
