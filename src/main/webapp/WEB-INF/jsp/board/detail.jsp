<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>게시판</title>
	<link href="/resources/css/join.css" rel="stylesheet">
	<script type="text/javascript" src="/resources/js/jquery-2.1.3.js"></script>
</head>
<body>
<form action="/board/write">
  <div>
    <label class="desc" id="title1" for="Field1">글번호</label>
    <div>
      <input id="Field1" name="id" type="text" class="field text fn" value="${board.id}" size="8" tabindex="1">
    </div>
  </div>

  <div>
    <label class="desc" id="title3" for="Field3">제목</label>
    <div>
      <input id="Field3" name="title" type="text" spellcheck="false" value="${board.title}" maxlength="255" tabindex="3">
   </div>
  </div>

	<div>
		<label class="desc" id="title4" for="Field4">내용</label>
		<div>
		  <textarea id="Field4" name="contents" spellcheck="true" rows="10" cols="50" tabindex="4">${board.contents}</textarea>
		</div>
	</div>

  <div>
          <div>
            <input id="saveForm" name="saveForm" type="submit" value="Submit">
    </div>
     </div>

</form>
</body>
</html>