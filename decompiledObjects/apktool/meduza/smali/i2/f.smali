.class public final Li2/f;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Li2/h;


# direct methods
.method public constructor <init>(Li2/h;)V
    .locals 0

    iput-object p1, p0, Li2/f;->a:Li2/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    const-class v0, Landroidx/window/extensions/core/util/function/Consumer;

    .line 2
    .line 3
    iget-object v1, p0, Li2/f;->a:Li2/h;

    .line 4
    .line 5
    iget-object v1, v1, Li2/h;->a:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const-string v2, "androidx.window.extensions.layout.WindowLayoutComponent"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    new-array v2, v2, [Ljava/lang/Class;

    .line 20
    .line 21
    const-class v3, Landroid/content/Context;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v3, v2, v4

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    aput-object v0, v2, v3

    .line 28
    .line 29
    const-string v5, "addWindowLayoutInfoListener"

    .line 30
    .line 31
    invoke-virtual {v1, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-array v5, v3, [Ljava/lang/Class;

    .line 36
    .line 37
    aput-object v0, v5, v4

    .line 38
    .line 39
    const-string v0, "removeWindowLayoutInfoListener"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "addListenerMethod"

    .line 46
    .line 47
    invoke-static {v2, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    const-string v1, "removeListenerMethod"

    .line 61
    .line 62
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    move v4, v3

    .line 76
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
    .line 81
    .line 82
    .line 83
.end method
