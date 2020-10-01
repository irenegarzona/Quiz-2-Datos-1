import time
class Observer():
    observador = []
    def __init__(self):
        self.observador.append(self)
        self.observadores = {}
    def observar(self,evento,callback):
        self.observadores[evento] = callback

class Evento1():
    notify = True
    def __init__(self, nombre, data, notify):
        self.nombre = nombre
        self.data = data
        if notify:
            self.notify1()
    def notify1(self):
        for persona in Observer.observador:
            if self.nombre in persona.observadores:
                persona.observadores[self.nombre](self.data)

class Restaurante(Observer):
    def __init__(self):
        print("Johnny Rockets")
        Observer.__init__(self)
    def saludar(self,persona):
        print(persona + " ya llegó! Todos digan hola.")
        time.sleep(3)
        print("Todo el restaurante te saluda! Hola!")


rest = Restaurante()
rest.observar("un cliente llegó", rest.saludar)

Evento1("un cliente llegó", "Joan",True)
Evento1("un cliente llegó", "Irene",True)
