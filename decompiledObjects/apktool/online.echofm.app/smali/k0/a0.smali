.class public final synthetic Lk0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/n$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld0/D$e;

.field public final synthetic c:Ld0/D$e;


# direct methods
.method public synthetic constructor <init>(ILd0/D$e;Ld0/D$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lk0/a0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lk0/a0;->b:Ld0/D$e;

    .line 7
    .line 8
    iput-object p3, p0, Lk0/a0;->c:Ld0/D$e;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lk0/a0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lk0/a0;->b:Ld0/D$e;

    .line 4
    .line 5
    iget-object v2, p0, Lk0/a0;->c:Ld0/D$e;

    .line 6
    .line 7
    check-cast p1, Ld0/D$d;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lk0/f0;->c0(ILd0/D$e;Ld0/D$e;Ld0/D$d;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
