.class public final synthetic Ll2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ll2/f;->a:I

    iput-object p2, p0, Ll2/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Ll2/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Ll2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Ll2/f;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    .line 10
    .line 11
    iget-object v1, p0, Ll2/f;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/app/Activity;

    .line 14
    .line 15
    check-cast p1, Landroid/content/res/Configuration;

    .line 16
    .line 17
    const-string p1, "this$0"

    .line 18
    .line 19
    invoke-static {v0, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string p1, "$activity"

    .line 23
    .line 24
    invoke-static {v1, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->e:Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->h(Landroid/app/Activity;)Li2/k;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v1, v0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;->a(Landroid/app/Activity;Li2/k;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :goto_0
    iget-object v0, p0, Ll2/f;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/io/InputStream;

    .line 42
    .line 43
    iget-object v1, p0, Ll2/f;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ld9/c0;

    .line 46
    .line 47
    check-cast p1, Lg9/u;

    .line 48
    .line 49
    invoke-virtual {p1}, Lg9/u;->d()V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lf9/f;

    .line 53
    .line 54
    iget-object v3, p1, Lg9/u;->e:Lf9/g;

    .line 55
    .line 56
    invoke-direct {v2, v3, v0}, Lf9/f;-><init>(Lf9/g;Ljava/io/InputStream;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p1, Lg9/u;->d:Ln9/a;

    .line 60
    .line 61
    new-instance v3, Lv3/x0;

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    invoke-direct {v3, p1, v2, v1, v4}, Lv3/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
