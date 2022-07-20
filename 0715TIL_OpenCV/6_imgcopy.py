import cv2

img1 = cv2.imread('dog.jpg')
img2 = img1 # img1과 img2는 같은 주소값을 담아서 같은 이미지를 가리킴
img3 = img1.copy() # img3는  copy메소들 통해서 img1객체의 내용을 가리키되 다른 주소값을 담음

img1 = cv2.imread('dog.jpg')
img2 = img1[64:300, 165:450]
img3 = img1[64:300, 165:450].copy()

img2.fill(0)

cv2.imshow('img1', img1)
cv2.imshow('img2', img2)
cv2.imshow('img3', img3)

cv2.waitKey()
cv2.destroyAllWindows()