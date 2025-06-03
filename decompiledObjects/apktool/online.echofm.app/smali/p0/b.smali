.class public final synthetic Lp0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lp0/b;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lp0/b;->a:I

    .line 2
    .line 3
    check-cast p1, Lp0/v$a;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lp0/g;->j(ILp0/v$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
