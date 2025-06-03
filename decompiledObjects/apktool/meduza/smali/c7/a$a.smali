.class public final enum Lc7/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc7/a$a;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc7/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lc7/a$a;

.field public static final enum c:Lc7/a$a;

.field public static final synthetic d:[Lc7/a$a;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lc7/a$a;

    const-string v1, "ABSENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lc7/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lc7/a$a;->b:Lc7/a$a;

    new-instance v1, Lc7/a$a;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lc7/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lc7/a$a;->c:Lc7/a$a;

    new-instance v3, Lc7/a$a;

    const-string v5, "OBJECT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lc7/a$a;-><init>(Ljava/lang/String;II)V

    const/4 v5, 0x3

    new-array v5, v5, [Lc7/a$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lc7/a$a;->d:[Lc7/a$a;

    new-instance v0, Lc7/f;

    invoke-direct {v0}, Lc7/f;-><init>()V

    sput-object v0, Lc7/a$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lc7/a$a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc7/a$a;
    .locals 1

    const-class v0, Lc7/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc7/a$a;

    return-object p0
.end method

.method public static values()[Lc7/a$a;
    .locals 1

    sget-object v0, Lc7/a$a;->d:[Lc7/a$a;

    invoke-virtual {v0}, [Lc7/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc7/a$a;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lc7/a$a;->a:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
