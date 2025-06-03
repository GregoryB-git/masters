.class public final synthetic Lk0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/n$a;


# instance fields
.field public final synthetic a:Ld0/u;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ld0/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/b0;->a:Ld0/u;

    .line 5
    .line 6
    iput p2, p0, Lk0/b0;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/b0;->a:Ld0/u;

    .line 2
    .line 3
    iget v1, p0, Lk0/b0;->b:I

    .line 4
    .line 5
    check-cast p1, Ld0/D$d;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lk0/f0;->m0(Ld0/u;ILd0/D$d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
