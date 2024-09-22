### Portuguese

```
Dentro da pasta application é onde ficará o CORE da aplicação, ou seja, toda regra de negócio e todo o restante do código que não deve ter acesso ao mundo externo (sem dependências de frameworks)

Core/Domain -> classes de domínio
Core/Usecase -> regras de negócios
```

```
Portas são interfaces

Ports/In -> Portas de entrada para acessar o CORE
Ports/Out -> Portas de saída para sair do CORE
```

```
Adapters são as implementações das portas de entrada e saída
Adapters/In -> Meios de entrada na aplicação, seja por controller, fila/mensageria, script, etc
Adapters/Out -> Meios de saída da aplicação, seja para acessar uma base de dados, chamar outra API, etc
```

### English

```
Inside the application folder is where the CORE of the application will be located, that is, all business rules and all the remaining code that should not have access to the outside world (without framework dependencies)

Core/Domain -> domain classes
Core/Usecase -> business rules
```

```
Ports are interfaces

Ports/In -> Input ports to access the CORE
Ports/Out -> Output ports to leave the CORE
```

```
Adapters are the implementations of input and output ports
Adapters/In -> Input means in the application, whether by controller, queue/messaging, script, etc
Adapters/Out -> Output means of the application, whether to access a database, call another API, etc
```