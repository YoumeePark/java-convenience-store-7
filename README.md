# java-convenience-store-precourse
# 편의점 결제 시스템

## 구현할 기능 목록

### 1. 제품 등록 및 재고 관리
- 편의점에서 판매하는 제품 목록을 관리합니다.
- 각 제품의 이름, 가격, 재고 수량을 설정합니다.
- 제품을 추가, 수정, 삭제할 수 있습니다.

### 2. 장바구니 추가 및 관리
- 사용자가 구매를 원하는 제품을 장바구니에 추가합니다.
- 각 제품에 대한 수량을 지정할 수 있으며, 중복 추가 시 수량이 증가합니다.
- 장바구니에서 제품을 제거할 수 있습니다.

### 3. 결제 금액 계산
- 장바구니에 담긴 제품들의 총 결제 금액을 계산합니다.
- 'N개 구매 시 1개 무료'와 같은 프로모션 할인을 적용합니다.
- 총 결제 금액에서 할인 금액을 반영해 최종 금액을 계산합니다.

### 4. 멤버십 할인 적용
- 멤버십 회원에게 추가 할인을 적용합니다.
- 특정 멤버십 등급에 따라 할인율을 설정합니다.

### 5. 재고 차감 및 업데이트
- 결제 후, 장바구니에 담긴 제품의 재고를 차감합니다.
- 재고가 부족할 경우 오류 메시지를 출력하고 결제를 중단합니다.

### 6. 영수증 출력
- 결제 완료 후, 영수증에 구매 제품, 수량, 가격, 할인 내역 및 총 결제 금액을 출력합니다.
- 영수증을 텍스트 형태로 화면에 표시합니다.

### 7. 오류 처리
- 잘못된 입력이나 재고 부족 등 예외 상황에 대해 '[ERROR]'로 시작하는 오류 메시지를 출력합니다.


# 변수 목록 및 설명

### 제품 및 장바구니 관련 변수

- `productName` : `String`  
  - 제품의 이름을 저장하는 변수입니다.
  
- `productPrice` : `int`  
  - 제품의 개당 가격을 저장하는 변수입니다.
  
- `productStock` : `int`  
  - 제품의 재고 수량을 저장하는 변수입니다. 구매 시마다 차감됩니다.
  
- `cartItems` : `Map<String, Integer>`  
  - 장바구니에 담긴 제품과 수량을 저장하는 변수입니다. 키는 제품 이름, 값은 수량입니다.
  
### 결제 및 할인 관련 변수

- `totalAmount` : `double`  
  - 장바구니의 제품 가격을 모두 합산한 총 결제 금액을 저장하는 변수입니다.
  
- `discountedAmount` : `double`  
  - 프로모션 할인을 적용한 후의 결제 금액을 저장하는 변수입니다.

- `membershipDiscount` : `double`  
  - 멤버십 할인을 적용한 후의 추가 할인 금액을 저장하는 변수입니다.

### 프로모션 및 멤버십 관련 변수

- `promotionThreshold` : `int`  
  - 'N개 구매 시 1개 무료' 프로모션에서 N을 의미하는 변수입니다.

- `promotionFreeItems` : `int`  
  - 프로모션에 따라 무료로 제공되는 항목 수를 저장하는 변수입니다.

- `isMember` : `boolean`  
  - 사용자가 멤버십 회원인지 여부를 나타내는 변수입니다.

- `membershipLevel` : `String`  
  - 회원의 멤버십 등급을 저장하는 변수로, 등급에 따라 할인율이 달라질 수 있습니다.

### 재고 및 영수증 관련 변수

- `stockAfterPurchase` : `Map<String, Integer>`  
  - 결제 후 제품의 재고 수량을 저장하여 재고를 관리하는 변수입니다.

- `receiptDetails` : `StringBuilder`  
  - 영수증 출력을 위한 구매 내역과 할인을 포함한 결제 요약을 저장하는 변수입니다.

### 오류 메시지 관련 변수

- `errorMessage` : `String`  
  - 잘못된 입력이나 재고 부족 등 예외 상황 발생 시 출력할 오류 메시지를 저장하는 변수입니다.
  
- `ERROR_PREFIX` : `String`  
  - 모든 오류 메시지 앞에 추가할 “[ERROR]” 문자열입니다. 오류 메시지의 일관성을 유지하는 데 사용됩니다.
