.class public final LD4/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LE4/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LD4/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LD4/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LD4/b;
    .locals 3

    .line 1
    iget-object v0, p0, LD4/a$b;->a:LE4/a;

    .line 2
    .line 3
    const-class v1, LE4/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lq5/b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LD4/a;

    .line 9
    .line 10
    iget-object v1, p0, LD4/a$b;->a:LE4/a;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, LD4/a;-><init>(LE4/a;LD4/a$a;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public b(LE4/a;)LD4/a$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lq5/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE4/a;

    .line 6
    .line 7
    iput-object p1, p0, LD4/a$b;->a:LE4/a;

    .line 8
    .line 9
    return-object p0
.end method
