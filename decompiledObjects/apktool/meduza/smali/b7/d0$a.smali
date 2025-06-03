.class public final enum Lb7/d0$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/d0$a;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic b:[Lb7/d0$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lb7/d0$a;

    const-string v1, "PRESENT"

    const/4 v2, 0x0

    const-string v3, "present"

    invoke-direct {v0, v1, v2, v3}, Lb7/d0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb7/d0$a;

    const-string v3, "SUPPORTED"

    const/4 v4, 0x1

    const-string v5, "supported"

    invoke-direct {v1, v3, v4, v5}, Lb7/d0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lb7/d0$a;

    const-string v5, "NOT_SUPPORTED"

    const/4 v6, 0x2

    const-string v7, "not-supported"

    invoke-direct {v3, v5, v6, v7}, Lb7/d0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    const/4 v5, 0x3

    new-array v5, v5, [Lb7/d0$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lb7/d0$a;->b:[Lb7/d0$a;

    new-instance v0, Lb7/b1;

    invoke-direct {v0}, Lb7/b1;-><init>()V

    sput-object v0, Lb7/d0$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb7/d0$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/d0$a;
    .locals 1

    const-class v0, Lb7/d0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/d0$a;

    return-object p0
.end method

.method public static values()[Lb7/d0$a;
    .locals 1

    sget-object v0, Lb7/d0$a;->b:[Lb7/d0$a;

    invoke-virtual {v0}, [Lb7/d0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/d0$a;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb7/d0$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lb7/d0$a;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
