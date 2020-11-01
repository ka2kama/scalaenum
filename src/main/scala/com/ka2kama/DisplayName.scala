package com.ka2kama

/**  表示名取得用trait
  */
trait DisplayName {

  /** @return 表示用の名称
    */
  def displayName: String = defaultDisplayName

  /** 表示名初期値
    */
  private[this] lazy val defaultDisplayName: String = toString
}
