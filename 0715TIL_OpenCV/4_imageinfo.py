import cv2

img1 = cv2.imread('cat.bmp', cv2.IMREAD_GRAYSCALE) # 흑백영상
img2 = cv2.imread('dog.jpg', cv2.IMREAD_COLOR) # 기본값 컬러영상

print('img1의 type', type(img1)) #<class 'numpy.ndarray'>
print('img2의 type', type(img2)) #<class 'numpy.ndarray'>

print('img1의 shape', img1.shape) # (480, 640)
print('img2의 shape', img2.shape) # (371, 600, 3)

print("img1의 ndim", img1.ndim) # 2
print("img2의 ndim", img2.ndim) # 3

print('img1의 dtype : ', img1.dtype) # uint8
print('img2의 dtype : ', img2.dtype) # uint8

h, w = img2.shape[:2] # h : 480 2 : 640
print('img2의 사이즈 : {} * {} =  {}'.format(w, h, w*h)) # 600 * 371 = 222600

#img의 shape으로 흑백영상, 컬러영상 구분하기
if len(img1.shape) == 2:
    print('흑백영상입니다')
elif len(img2.shape) == 3:
    print("컬러영상입니다")

# 픽셀값 변경하기
# for문으로 픽셀값을 변경하는 것은 매우 느림
# for y in range(h):
#     for x in range(w):
#         img1[y, x] = 30
#         img2[y, x] = (123, 77, 200) # BGR순

# 슬라이싱을 이용한 픽셀값 변경
img1[:,:] = 30
img2[:,:] = (123, 77, 231)

cv2.imshow('img1', img1)
cv2.imshow('img2', img2)
cv2.waitKey()
cv2.destroyAllWindows()

