.class public final Lk4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/i$a;
    }
.end annotation


# static fields
.field public static final d:Ln7/o;

.field public static final e:Ln7/o;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    invoke-static {v0}, Ln7/o;->a(C)Ln7/o;

    move-result-object v0

    sput-object v0, Lk4/i;->d:Ln7/o;

    const/16 v0, 0x2a

    invoke-static {v0}, Ln7/o;->a(C)Ln7/o;

    move-result-object v0

    sput-object v0, Lk4/i;->e:Ln7/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk4/i;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lk4/i;->b:I

    return-void
.end method
