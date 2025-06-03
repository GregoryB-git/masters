.class public Lp5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:LE5/k$d;

.field public final synthetic b:Lp5/d;


# direct methods
.method public constructor <init>(Lp5/d;LE5/k$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp5/d$a;->b:Lp5/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lp5/d$a;->a:LE5/k$d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/d$a;->a:LE5/k$d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/d$a;->a:LE5/k$d;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LE5/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
