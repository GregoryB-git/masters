.class public Ld4/c$b;
.super LS3/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld4/c;->S(Ld4/c$c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Ld4/c$c;

.field public final synthetic c:Ld4/c;


# direct methods
.method public constructor <init>(Ld4/c;Ld4/c$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld4/c$b;->c:Ld4/c;

    .line 2
    .line 3
    iput-object p2, p0, Ld4/c$b;->b:Ld4/c$c;

    .line 4
    .line 5
    invoke-direct {p0}, LS3/h$b;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Ld4/c$b;->a:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ld4/b;

    .line 2
    .line 3
    check-cast p2, Ld4/n;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ld4/c$b;->b(Ld4/b;Ld4/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ld4/b;Ld4/n;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ld4/c$b;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ld4/b;->o()Ld4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ld4/b;->h(Ld4/b;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Ld4/c$b;->a:Z

    .line 17
    .line 18
    iget-object v0, p0, Ld4/c$b;->b:Ld4/c$c;

    .line 19
    .line 20
    invoke-static {}, Ld4/b;->o()Ld4/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Ld4/c$b;->c:Ld4/c;

    .line 25
    .line 26
    invoke-virtual {v2}, Ld4/c;->t()Ld4/n;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, Ld4/c$c;->b(Ld4/b;Ld4/n;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Ld4/c$b;->b:Ld4/c$c;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Ld4/c$c;->b(Ld4/b;Ld4/n;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
