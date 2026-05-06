#include <stdio.h>
#include <stdlib.h>

// Estrutura do nó da lista encadeada
typedef struct no {
  int dado;             // Valor armazenado no nó
  struct no *proximo;   // Ponteiro para o próximo nó
} No;

// Ponteiro para o primeiro nó da lista
No *cabeca = NULL;

// Função para inserir um nó no início da lista
void inserir_no_inicio(int dado) {
  // Aloca memória para o novo nó
  No *novo_no = malloc(sizeof(No));

  // Atribui o valor ao novo nó
  novo_no->dado =dado;

  // Se a lista estiver vazia, o novo nó é o primeiro nó
  if (cabeca == NULL) {
    cabeca = novo_no;
    novo_no->proximo = NULL;
    return;
  }

  // O novo nó aponta para o antigo primeiro nó
  novo_no->proximo = cabeca;

  // Atualiza o primeiro nó da lista para o novo nó
  cabeca = novo_no;
}

// Função que retorna o último nó da lista
No* ultimo_no() {
  if (cabeca == NULL) {
    return NULL;
  }
  No *temp = cabeca;
  while (temp->proximo != NULL) {
    temp = temp->proximo;
  }
  return temp;
}

// Função para inserir um nó no fim da lista
void inserir_no_fim(int dado) {
  // Aloca memória para o novo nó
  No *novo_no = malloc(sizeof(No));

  // Atribui o valor ao novo nó
  novo_no->dado = dado;
  novo_no->proximo = NULL;
  

  // Se a lista estiver vazia, o novo nó é o primeiro nó
  if (cabeca == NULL) {
    cabeca = novo_no;
    return;
  }

  // Percorre a lista até encontrar o último nó
  No *ultimo = ultimo_no();

  // O último nó agora aponta para o novo nó
  ultimo->proximo = novo_no;
}

// Função para buscar um nó na lista pelo valor
No* buscar_no(int dado) {
  // Se a lista estiver vazia, retorna NULL
  if (cabeca == NULL) {
    return NULL;
  }

  // Percorre a lista até encontrar o nó com o valor especificado
  No *temp = cabeca;
  while (temp != NULL && temp->dado != dado) {
    temp = temp->proximo;
  }

  // Retorna o nó encontrado ou NULL se não for encontrado
  return temp;
}

// Função para remover um nó da lista pelo valor
void remover_no(int dado) {
  // Busca o nó com o valor especificado
  No *no_a_remover = buscar_no(dado);

  // Se o nó não for encontrado, retorna
  if (no_a_remover == NULL) {
    return;
  }

  // Se o nó for o primeiro nó da lista
  if (no_a_remover == cabeca) {
    // Atualiza o primeiro nó para o próximo nó
    cabeca = cabeca->proximo;
  } else {
    // Encontra o nó anterior ao nó a ser removido
    No *anterior = cabeca;
    while (anterior->proximo != no_a_remover) {
      anterior = anterior->proximo;
    }

    // Remove o nó da lista
    anterior->proximo = no_a_remover->proximo;
  }

  // Libera a memória alocada para o nó
  free(no_a_remover);
}

// Função para imprimir os dados de todos os nós da lista
void imprimir_lista() {
  if (cabeca == NULL) {
    printf("Lista vazia!\n");
    return;
  }

  // Percorre a lista e imprime o valor de cada nó
  No *temp = cabeca;
  while (temp != NULL) {
    printf("%d ", temp->dado);
    temp = temp->proximo;
  }

  // Pula uma linha
  printf("\n");
}

// Função principal
int main() {
    
  int ini, fim, rem, i, x;
  
  scanf("%d %d %d", &ini, &fim, &rem);
  for (i = 0; i < ini; i++) {
      scanf("%d", &x);
      inserir_no_inicio(x);
  }
  for (i = 0; i < fim; i++) {
      scanf("%d", &x);
      inserir_no_fim(x);
  }
  for (i = 0; i < rem; i++) {
      scanf("%d", &x);
      remover_no(x);
  }

  imprimir_lista();

  return 0;
}