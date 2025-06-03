.class public final Lx0/l$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lx0/l$d;


# direct methods
.method public constructor <init>(ILjava/lang/Object;Lx0/l$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lx0/l$f;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lx0/l$f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lx0/l$f;->c:Lx0/l$d;

    .line 9
    .line 10
    return-void
.end method
