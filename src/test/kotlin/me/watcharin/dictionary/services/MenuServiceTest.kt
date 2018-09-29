package me.watcharin.dictionary.services

import junit.framework.Assert.*
import me.watcharin.dictionary.models.Menu
import me.watcharin.dictionary.repositories.MenuRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MenuServiceTest {
    @InjectMocks
    lateinit var menuService: MenuService

    @Mock
    lateinit var menuRepositoryMock: MenuRepository

    @Test
    fun shouldReturnNotNull_whenFindAll() {
        var response : List<Menu> = arrayListOf(Menu(name = "Finance"), Menu(name = "Accounting"))
        doReturn(response).`when`(menuRepositoryMock).findAll()

        val result = menuService.findAll()

        assertNotNull(result)
    }

    @Test
    fun shouldReturnTwoObject_whenFindAll(){
        var response : List<Menu> = arrayListOf(Menu(name = "Finance"), Menu(name = "Accounting"))
        doReturn(response).`when`(menuRepositoryMock).findAll()

        val result = menuService.findAll()

        assertEquals(response.size, result.size)
    }
}