# Projeto_software
O seguinte projeto visa a construção de um aleatorizador capaz de selecionar um elemento entre um grupo fornecido ou um elemento entre uma sequência de números fornecidos.
Em sua arquitetura foi utilizado java e javascript para construir o backend do sistema, enquanto html e css foram utilizados para construir o frontend do sistema.
Os diagramas UML a seguir representam o funcionamento do sistema:
+-----------------------+                          +---------------------------------+
|     Aleatorizador      |                         |            Sistema              |
+-----------------------+                          |                                 |
| - Sequência de números |              Usuário - -|- - - (Fornecer elementos)       |
| - Grupo de elementos   |                 | - - - | - (Sortear elemento aleatório)  |
+-----------------------+                  | - - - | (Fornecer sequência de números) |
| + adicionarElemento    |                 | - - - | - (Sortear número aleatório)    |
| + sortearElemento      |                         |                                 |
| + sortearNumeroEntre   |                         +---------------------------------+
+-----------------------+
   Diagrama de classes                                   Diagrama de caso de uso
