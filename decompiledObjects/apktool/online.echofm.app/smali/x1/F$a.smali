.class public final Lx1/F$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lx1/F;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx1/F;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx1/F$a;->a:Lx1/F;

    .line 10
    .line 11
    iput-object p2, p0, Lx1/F$a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lx1/F;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/F$a;->a:Lx1/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/F$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
