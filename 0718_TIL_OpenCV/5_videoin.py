import cv2
import sys

cap = cv2.VideoCapture('Sunset.mp4')

if not cap.isOpened():
    print("동영상을 열 수 없습니다")
    sys.exit()
print("가로 사이즈 : ", int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))) # 1280
print("세로 사이즈 : ", int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))) # 720
print("프레임 수 : ", int(cap.get(cv2.CAP_PROP_FRAME_COUNT))) # 399

fps = cap.get(cv2.CAP_PROP_FPS)
print("FPS : ", fps) # 25.0

while True:
    ret, frame = cap.read()

    if not ret:
        break
    cv2.imshow('frame', frame)

    if cv2.waitKey(10) == 27:
        break
cap.release()
cv2.destroyAllWindows()