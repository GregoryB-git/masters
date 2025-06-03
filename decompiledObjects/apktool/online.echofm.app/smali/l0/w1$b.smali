.class public final Ll0/w1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ld0/q;

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ld0/q;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/w1$b;->a:Ld0/q;

    .line 5
    .line 6
    iput p2, p0, Ll0/w1$b;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Ll0/w1$b;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method
