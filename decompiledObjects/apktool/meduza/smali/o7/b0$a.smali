.class public final Lo7/b0$a;
.super Lo7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final e:Lo7/b0$a;


# instance fields
.field public final c:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field public final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/b0$a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1}, Lo7/b0$a;-><init>([Ljava/lang/Object;)V

    sput-object v0, Lo7/b0$a;->e:Lo7/b0$a;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lo7/a;-><init>(II)V

    iput-object p1, p0, Lo7/b0$a;->c:[Ljava/lang/Object;

    iput v0, p0, Lo7/b0$a;->d:I

    return-void
.end method


# virtual methods
.method public final b(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lo7/b0$a;->c:[Ljava/lang/Object;

    iget v1, p0, Lo7/b0$a;->d:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method
