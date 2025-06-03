.class public Lk3/c$a;
.super Lk3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/c;->a(Lk3/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lk3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lk3/c$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lk3/c$b;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lk3/c$a;->c:Lk3/c$b;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lk3/c;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lk3/c$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
