.class public final synthetic LC2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/k;


# instance fields
.field public final synthetic a:LA2/r;


# direct methods
.method public synthetic constructor <init>(LA2/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC2/b;->a:LA2/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC2/b;->a:LA2/r;

    .line 2
    .line 3
    check-cast p1, LC2/e;

    .line 4
    .line 5
    check-cast p2, LV2/k;

    .line 6
    .line 7
    sget-object v1, LC2/d;->k:Ly2/a$g;

    .line 8
    .line 9
    invoke-virtual {p1}, LA2/c;->D()Landroid/os/IInterface;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, LC2/a;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LC2/a;->Z0(LA2/r;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p2, p1}, LV2/k;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
